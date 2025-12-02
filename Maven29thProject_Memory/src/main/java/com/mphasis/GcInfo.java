package com.mphasis;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GcInfo {

	public static void main(String[] args) throws InterruptedException {
		List<GarbageCollectorMXBean> gcBeans=ManagementFactory.getGarbageCollectorMXBeans();

		
		
		System.out.println("Requesting gc");
		System.gc();
		
		
		for(GarbageCollectorMXBean gcmx:gcBeans)
		{
			System.out.println("GC Name : "+gcmx.getName());
			System.out.println("Count : "+gcmx.getCollectionCount());
			System.out.println("Tme(ms) : "+gcmx.getCollectionTime());
		}
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("garbage collected");
	}

}
