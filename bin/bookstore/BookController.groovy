package bookstore


import grails.rest.*
import grails.converters.*

class BookController {
	static responseFormats = ['json', 'xml']
	
    def index() { 
         //respond Book.get(1)
         respond Book.list()
         /* def results = Book.list()
         render (contentType: "application/json"){
             books = array {
                 for (b in results)
                 book b.bookname, b.author, b.price
             } */
         //} 
   }
    def show(long id)
    {
        respond Book.get(id)
    } 
    def delete(long id)
    {

    }
    def save()
    {

    }
    def update (long id)
    {
        
    }
}
