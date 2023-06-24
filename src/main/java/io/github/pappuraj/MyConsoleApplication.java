package io.github.pappuraj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import io.github.pappuraj.dao.RoboticShopDao;
import io.github.pappuraj.model.RoboticProduct;

public class MyConsoleApplication {
		
	static void pr(String s) {
		System.out.print(s);
	}
	
	static void prl(String s) {
		System.out.println(s);
	}
	
	public static void start(RoboticShopDao dao) throws NumberFormatException, IOException {
		
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		
		prl("\n\nWelcome to our project!\n........................\n\n");
		while(true) {
			prl("\n\nSelection option: \n\n1. Insert product\n"
					+ "2. View all products\n3. Update product\n4. Delete product\n"
					+ "5. Search by ID\n6. Search by model\n7. Search by name\n"
					+ "8. Search by category\n9. Search by price range\n0. Exit");
			pr("\nYour input: ");

			
			switch (Integer.parseInt(sc.readLine())) {
			case 1:
				String in;
				double price;
				RoboticProduct prod=new RoboticProduct();
				prl("Adding a new product...\n");
				pr("Enter name: ");
				in=sc.readLine();
				prod.setName(in);
				
				pr("Enter model: ");
				in=sc.readLine();
				prod.setModel(in);
				
				pr("Enter category: ");
				in=sc.readLine();
				prod.setCategory(in);
				
				pr("Enter price: ");
				price=Double.parseDouble(sc.readLine());
				prod.setPrice(price);
				
				prl(dao.insertProduct(prod)>0?"Product inserted!":"Product not inserted!");
				
				break;
			
			case 2:
				List<RoboticProduct> products=dao.viewAllProduct();
				prl("\n\nList of "+products.size()+" products are:\n");
				for(RoboticProduct rp:products) System.out.println(rp);
				break;
				
			case 3:
				prod=new RoboticProduct();
				prl("Updating a new product...\n");
				
				pr("Enter ID: ");
				in=sc.readLine();
				prod.setId(Integer.parseInt(in));
				
				pr("Enter name: ");
				in=sc.readLine();
				prod.setName(in);
				
				pr("Enter model: ");
				in=sc.readLine();
				prod.setModel(in);
				
				pr("Enter category: ");
				in=sc.readLine();
				prod.setCategory(in);
				
				pr("Enter price: ");
				price=Double.parseDouble(sc.readLine());
				prod.setPrice(price);
				
				prl(dao.updateProduct(prod)>0?"Product updated!":"Product not updated!");
				
				break;
				
			case 4:
				prod=new RoboticProduct();
				prl("Deleting a new product...\n");
				
				pr("Enter ID: ");
				in=sc.readLine();
				prl(dao.deleteProduct(Integer.parseInt(in))>0?"Product deleted!":"Product not deleted!");
				break;
				
			case 5:
				prl("Searching a new product...\n");
				
				pr("Enter ID: ");
				in=sc.readLine();
				System.out.println(dao.searchById(Integer.parseInt(in)));
				break;
				
			case 6:
				prl("Searching a new product...\n");
				
				pr("Enter model: ");
				in=sc.readLine();
				System.out.println(dao.searchByModel(in));
				break;
				
			case 7:
				prl("Searching a new product...\n");
				
				pr("Enter name: ");
				in=sc.readLine();
				products=dao.searchByname(in);
				prl("\n\nList of "+products.size()+" products are:\n");
				for(RoboticProduct rp:products) System.out.println(rp);
				break;
				
			case 8:
				prl("Searching a new product...\n");
				
				pr("Enter category: ");
				in=sc.readLine();
				products=dao.searchByCategory(in);
				prl("\n\nList of "+products.size()+" products are:\n");
				for(RoboticProduct rp:products) System.out.println(rp);
				break;
				
			case 9:
				prl("Searching a new product...\n");
				
				pr("Enter starting price: ");
				in=sc.readLine();
				double d=Double.parseDouble(in);
				pr("Enter ending price: ");
				in=sc.readLine();
				products=dao.searchByPriceRange(d,Double.parseDouble(in));
				prl("\n\nList of "+products.size()+" products are:\n");
				for(RoboticProduct rp:products) System.out.println(rp);
				break;
				
			case 0:
				
				break;
				
				
			default:
				break;
			}
		}
	}
	
	

	
}
