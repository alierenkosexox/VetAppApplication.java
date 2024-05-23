package dev.patika.vetapp.v1.core.utilites;

import dev.patika.vetapp.v1.core.result.Result;
import dev.patika.vetapp.v1.core.result.ResultData;

public class ResulHelper {
    public static <T> ResultData<T> CREATED(T data){
        return new ResultData<>(true,Message.CREATED,"201",data);
    }

    public static Result NOT_FOUND_CUSTOMER(){
        return new Result(false,Message.NOT_FOUND_CUSTOMER,"400");
    }
}
