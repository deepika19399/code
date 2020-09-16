package com.hcl.main;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {
				ArrayList arrayList = new ArrayList();
				arrayList.add("55");
				arrayList.add("25");
				arrayList.add("68");

				System.out.println("ArrayList");

				for(int index=0; index < arrayList.size(); index++)
					System.out.println(arrayList.get(index));

				arrayList.set(1,"67");

			
				System.out.println("ArrayList after replacement");
					for(int index=0; index < arrayList.size(); index++)

				System.out.println(arrayList.get(index));
			}
		}


