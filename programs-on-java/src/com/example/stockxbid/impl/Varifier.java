package com.example.stockxbid.impl;

public class Varifier {

	public static void main(String args[]) {

		String str = "<header><ul><li>Special technologies</li><li>Green and black brand logo backpack Padded sternum shoulder straps</li><li>Features: Daisy chains Warranty: 6 months Warranty against manufacturing defects </li><li></li></ul></header><ul><li>Pattern : Digital Print</li><li>  Style Type  : BackPacks</li><li> Material Detail : Polyester Wipe with a clean, dry cloth when needed</li><li>Material Type : Polyester</li><li>Laptop Compartment  : Yes</li><li>Compartment Detail : 1 main compartment with zip closure 3 zip pockets, 2 stash pockets Padded laptop compartment on the back Non-Padded haul loop Padded Mesh back</li></ul>";
		
		String condition = "Style Type  : HandBags";
		
		if(str.contains(condition)) {
			System.out.println("BackPacks");
		}else {
			System.out.println("Handbags");
		}

	}

}
