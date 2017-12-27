package test

class HttpRequest(val accept : String, val length: Int)
class HttpResponse(var content : String, var statusCode: Int){
    operator fun invoke(function : HttpHandler.() -> Unit){}
}
class HttpHandler(val request : HttpRequest, val response: HttpResponse)
fun get(path: String, handler:(HttpHandler) -> Unit){

}

fun main(args: Array<String>) {
    get("/home"){
        hanlder->

        if(hanlder.request.accept == "application/json"){
        }else{
            hanlder.response.statusCode = 405
        }
    }


//    get("/home"){
//        hanlder->
//        if(hanlder.request.accept == "application/json"){
//            hanlder.response.content = "Blash!"
//        }else{
//            hanlder.response.statusCode = 405
//        }
//    }
}