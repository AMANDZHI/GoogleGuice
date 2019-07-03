import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

public class ConfigModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(HelloWorldService.class)
                .annotatedWith(Names.named("HelloWorldGoogle"))
                .to(HelloWorldServiceImpl.class)
                .in(Scopes.SINGLETON);
    }
}
