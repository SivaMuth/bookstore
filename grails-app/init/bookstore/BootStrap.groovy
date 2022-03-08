package bookstore

class BootStrap {

    def init = { servletContext ->
    new Book(bookname:"ABCD", author:"T", price:300, count:5).save()
    new Book(bookname:"EFGH", author:"U", price:400, count:7).save()
    new Book(bookname:"IJKL", author:"W", price:500, count:10).save()
    }
    def destroy = {
    }
}
