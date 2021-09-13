package com.example.libSer.service;

import com.example.libSer.domain.Book;
import com.example.libSer.domain.User;

import java.util.List;

public interface BookService {
    /**
     * Добавляет новую книгу
     * @param bookName - название книги
     * @param author - имя автора книги
     * @param totalBooksCount - количество книг
     */
    Boolean addBook(String bookName, String author, Integer totalBooksCount);

    /**
     * Возвращает список, имеющихеся книг
     * @return список книг
     */
    List<Book> getAllBooks();

    /**
     * Возвращает книгу по её ID
     * @param id - ID книги
     * @return книга по ID
     */
    Book getBookById(Long id);

    /**
     * Возвращает книгу по её названию.
     * @param bookName - название книги
     * @return книга по названию
     */
    Book getBookByBookName(String bookName);

    /**
     * Обновляет книги по ее ID
     * @param id - id книги, которую нужно обновить
     * @param bookName - новое имя книги
     * @param author - новый автор книги
     * @param totalBooksCount - новое значение кол-ва книг
     * @return - true если данные были обновлены, иначе false
     */
    Boolean editBook(Long id, String bookName, String author, Integer totalBooksCount);

    /**
     * Удаляет книгу по заданным ID
     * @param id - id книги, которого нужно удалить
     * @return - true если книга была удалена, иначе false
     */
    Boolean deleteBook(Long id);

    /**
     * Добавляет владельца книги
     * @param user - пользователь, которого назначают владельцем
     * @param book - книга добавляемая пользователю
     * @return - true если книга была удалена, иначе false
     */
    Boolean setUserForBook(User user, Book book);

    /**
     * Удаляет владельца у книги
     * @param user - пользователь, у которого удаляют книгу
     * @param book - книга удаляемая у пользователя
     * @return - true если книга была удалена, иначе false
     */
    Boolean removeUserFromBook(User user, Book book);

}