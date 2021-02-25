package fr.training;

public class SimpleJpaApp {

	public static void main(String[] args) {
		System.out.println("Coucou les filles");
		CategorieService cs = new CategorieService();
		
		CategorieEntity c1 = new CategorieEntity("CategorieParent");
		cs.save(c1);
		cs.findAll().forEach(System.out::println);
	}

}
