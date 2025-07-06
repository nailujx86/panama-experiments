package net.nailuj;

import net.nailuj.win.winapi;
import net.nailuj.win.winapi_22;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class Main {
	public static void main(String[] args) {
		System.loadLibrary("user32");
		Arena arena = Arena.ofAuto();
		MemorySegment lpcstr = arena.allocate(winapi.LPCSTR);
		lpcstr.setString(0, "Test");
		MemorySegment header = arena.allocate(winapi.LPCSTR);
		header.setString(0, "Toast");
		winapi_22.MessageBoxA(MemorySegment.NULL, lpcstr, header, 0);
	}
}