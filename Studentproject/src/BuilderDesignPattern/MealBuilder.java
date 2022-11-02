package BuilderDesignPattern;

public interface MealBuilder {
		// TODO Auto-generated constructor stub
	public void buildStarter();
	public void buildMainCourse();
	public void buildDesserts();
	
	public Meal getMeal();
	}

