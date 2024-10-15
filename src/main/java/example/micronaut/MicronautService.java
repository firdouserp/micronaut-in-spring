package example.micronaut;

import jakarta.inject.Singleton;

@Singleton
public class MicronautService {

//    @Autowired
//    ESBooksRepositoryImpl booksRepository;
//    @Autowired
//    BooksService booksService;

    public String greet() {
        return "hello from micronaut";
    }


    public void checkBooksRepository() {
       
//        return booksRepository.findAll(SortField.CREATED, SortOrder.DESC, 0).block();
    }


//    public Page<co.yaqut.server.retrieve.core.dto.Book> checkBooksService() {
//
//        return booksService.findAll(SortField.CREATED, SortOrder.DESC, 0).block();
//    }
}
