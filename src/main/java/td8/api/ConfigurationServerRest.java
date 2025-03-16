package td8.api;

import td8.application.LibraryService;
import td8.domain.LibraryRepository;
import td8.infra.persistence.hibernate.LibraryRepositoryHibernate;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class ConfigurationServerRest extends AbstractBinder {

    @Override
    protected void configure() {
        bindAsContract(LibraryService.class);
        bind(LibraryRepositoryHibernate.class).to(LibraryRepository.class);
    }
}
