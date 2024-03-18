package br.com.arthur.screenmatchnew.utils;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

}

