package com.test.coreJava;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @计算文件的32位的循环冗余校验和（CRC32）,这个数值就是经常用来判断一个文件是否已损坏的校验和
 * 因为文件损坏极有可能导致检验和改变
 * CRC32类可以使用下面的循环来计算一个字节序列的校验和。
 */
public class NIOTset {

	public static long checksumInputStream(String filename) throws IOException
	{
		InputStream in = new FileInputStream(filename);
		CRC32 crc = new CRC32();
		
		int c;
		while((c = in.read())!= -1)
		{
			crc.update(c);
		}
		
		return crc.getValue();
	}
	
	public static long checksumBufferedInputStream(String filename) throws IOException
	{
		InputStream in = new BufferedInputStream(new FileInputStream(filename));
		CRC32 crc = new CRC32();
		
		int c;
		while((c = in.read())!= -1)
		{
			crc.update(c);
		}
		
		return crc.getValue();
	}
	
	public static long checksumRandomAccessFile(String filename) throws IOException
	{
		RandomAccessFile file = new RandomAccessFile(filename,"r");
		long length = file.length();
		CRC32 crc = new CRC32();
		
		for(long p = 0; p < length; p++)
		{
			file.seek(p);
			int c = file.readByte();
			crc.update(c);
		}
		return crc.getValue();
	}
	
	public static long checksumMappedFile(String filename) throws IOException
	{
		FileInputStream in = new FileInputStream(filename);
		FileChannel channel = in.getChannel();
		
		CRC32 crc = new CRC32();
		int length = (int) channel.size();
		MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, length);
		
		for(int p = 0; p < length; p++)
		{
			int c = buffer.get(p);
			crc.update(c);
		}
		return crc.getValue();
	}
	
	public static void main(String[] args) throws IOException
	{

		System.out.println("Input Stream: ");
		long start = System.currentTimeMillis();
		long crcValue = checksumInputStream(args[0]);
		long end =  System.currentTimeMillis();
		System.out.println(Long.toHexString(crcValue));
		System.out.println((end - start) + "milliseconds");
		
		System.out.println("Buffered Input Stream: ");
		start = System.currentTimeMillis();
		crcValue = checksumBufferedInputStream(args[0]);
		end =  System.currentTimeMillis();
		System.out.println(Long.toHexString(crcValue));
		System.out.println((end - start) + "milliseconds");
		
		System.out.println("Rabdom Accesee File: ");
		start = System.currentTimeMillis();
		crcValue = checksumRandomAccessFile(args[0]);
		end =  System.currentTimeMillis();
		System.out.println(Long.toHexString(crcValue));
		System.out.println((end - start) + "milliseconds");
		
		System.out.println("Mapped File: ");
		start = System.currentTimeMillis();
		crcValue = checksumMappedFile(args[0]);
		end =  System.currentTimeMillis();
		System.out.println(Long.toHexString(crcValue));
		System.out.println((end - start) + "milliseconds");


	}

}
