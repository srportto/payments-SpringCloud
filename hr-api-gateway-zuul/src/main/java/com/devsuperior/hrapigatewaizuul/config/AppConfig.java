package com.devsuperior.hrapigatewaizuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class AppConfig {
    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
        tokenConverter.setSigningKey("MY-SECRET-KEY"); //chave de encript de decript dos tokens JWT
        return  tokenConverter;
    }

    //abaixo Bean de objeto capaz de ler as informacoes de um token, por isso recebe o metodo que fornece a chave
    @Bean
    public JwtTokenStore tokenStore(){
        return  new JwtTokenStore(accessTokenConverter());
    }
}
