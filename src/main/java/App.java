import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.car.Corolla;
import org.studyeasy.car.Swift;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Car swift = new Swift();
		swift.specs();
		
		Car corrola = new Corolla();
		corrola.specs();
		*/
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean(Car.class);
		
		myCar.specs();
		
		context.close();
		

	}

}
