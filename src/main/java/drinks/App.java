package drinks;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");        
        Beverage coffee = (Beverage) context.getBean("coffee");
        Beverage smoothie = (Beverage) context.getBean("smoothie");
        Cup glassCup = (Cup) context.getBean("glassCup");
        Cup thermos = (Cup) context.getBean("thermos");
        System.out.println(coffee);
        System.out.println(smoothie);
        System.out.println(glassCup);
        System.out.println(thermos);
    }
}
