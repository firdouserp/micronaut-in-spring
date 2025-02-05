/*
 * Copyright 2017-2024 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.micronaut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

//@RestController // <1>
public class BookController {
    @Autowired // <2>
    private BookRepository bookRepository;

    @Autowired 
    private SpringService springService;
    
    @GetMapping("/books") // <3>
    Iterable<Book> list() {
        return bookRepository.findAll();
    }
    
    @GetMapping("/greet") // <3>
    String greet() {
        return springService.greet();
    }
    
    
    
}
