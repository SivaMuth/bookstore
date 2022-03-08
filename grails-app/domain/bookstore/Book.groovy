package bookstore
import grails.rest.*
@Resource(uri='/books', formats=['xml', 'json'])
class Book {

    Long id
    String bookname
    String author
    Double price
    Long count

    static constraints = {
        bookname blank:false
        author blank:false
        price blank:false
        count blank:false
    }
}
