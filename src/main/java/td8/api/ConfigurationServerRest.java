package td8.api;

import td8.application.BookAssembler;
import td8.application.LibraryService;
import td8.domain.LibraryRepository;
import td8.infra.persistence.hibernate.HibernateLibraryRepository;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import td8.infra.persistence.hibernate.InMemoryLibraryRepository;

public class ConfigurationServerRest extends AbstractBinder {
    private static LibraryRepository LibraryRepositoryInstance = new HibernateLibraryRepository();

    public static void useInMemoryRepositories() {
        LibraryRepositoryInstance = new InMemoryLibraryRepository();
    }

    @Override
    protected void configure() {
        bindAsContract(BookAssembler.class);
        bindAsContract(LibraryService.class);
        bind(LibraryRepositoryInstance).to(LibraryRepository.class);
    }
}
