import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import javax.inject.Inject;
import javax.inject.Named;

public class Main {

    @Inject @Named("HelloWorldGoogle")
    private HelloWorldService helloWorldService;

    public static void main(String[] args) {
        Main main = new Main();
        Module module = new ConfigModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(main);


        main.testGoogleGuice();
    }

    public void testGoogleGuice() {
        helloWorldService.sayHello();
    }
}
