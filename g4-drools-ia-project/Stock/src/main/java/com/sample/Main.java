package com.sample;

import java.util.ArrayList;
import java.util.Random;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import com.sample.model.Product;
import com.sample.utils.KnowledgeSessionHelper;

public class Main {

	public static void main(String[] args) {
		KieContainer container = KnowledgeSessionHelper.createRuleBase();
		String sessionName = "ksession-stock-rules";
		
		KieSesion session = KnowledgeSessionHelper.getStatefulKnowledgeSession(container, sessionName);
		ArrayList<Product> products = new ArrayList<Product>();
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			Product productToAdd = new Product("Product " + i, random.nextInt(40));
			products.add(productToAdd);
			session.insert(productToAdd);
		}
		
		session.fireAllRules();
		
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
