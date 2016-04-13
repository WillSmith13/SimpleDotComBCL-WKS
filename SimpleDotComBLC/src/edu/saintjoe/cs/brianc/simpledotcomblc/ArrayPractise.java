package edu.saintjoe.cs.brianc.simpledotcomblc;

import java.util.ArrayList;

		public class ArrayPractise {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//String[] names;
				//names = new String[5];
				
				ArrayList<String> names = new ArrayList<String>();
				
				names.add("Arnold");
				names.add("Luis");
				names.add("Elmo");
				names.add("Luke");
				names.add("Lee");
				names.add("Hernia");
				
				System.out.println(names);
				
				for (String onename : names) {
					if (onename.equals("Elmo")) {
						System.out.println("Found elmo at position " + names.indexOf("Elmo"));
					}
				}
				
				System.out.println("Replacing Arnold with Ryan and Luis with Roberto");
				names.set(0, "Ryan");
				names.set(1, "Roberto");
				System.out.println(names);

			}//end main

		}//end ArrayPractise


