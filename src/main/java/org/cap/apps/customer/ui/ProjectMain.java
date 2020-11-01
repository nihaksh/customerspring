package org.cap.apps.customer.ui;

import org.cap.apps.customer.JavaConfiguration;
import org.cap.apps.customer.exceptions.InvalidIdException;
import org.cap.apps.customer.exceptions.InvalidNameException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectMain {

    public static void main(String args[]) {
        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
            context.register(JavaConfiguration.class);
            context.refresh();
            ProjectUi projectUi = context.getBean(ProjectUi.class);
            projectUi.run();
            context.close();
        } 
        catch(InvalidIdException e) {
            System.out.println(e.getMessage());
        
        } 
        catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("something went wrong");
        }

    }

}
