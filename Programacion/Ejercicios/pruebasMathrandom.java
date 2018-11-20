/*
 * pruebasMathrandom.java
 * 
 * Copyright 2018 Familia <Familia@TOM¡S>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.lang.Math;

public class pruebasMathrandom {
	
	public static void main (String[] args) {
		
		System.out.println("20 n√∫meros aleatorios entre 50 y 60 (sin decimales):");
		
		for (int i = 1; i <= 20; i++) {
			System.out.print(((int)(Math.random()*(5+1)+5) + " "));
		}
		
		System.out.println();
		
	}
}

