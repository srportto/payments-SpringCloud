package com.devsuperior.hrapigatewaizuul.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@RefreshScope
@Configuration
public class AppConfig {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
        tokenConverter.setSigningKey(jwtSecret); //chave de encript de decript dos tokens JWT
        return  tokenConverter;
    }

    //abaixo Bean de objeto capaz de ler as informacoes de um token, por isso recebe o metodo que fornece a chave
    @Bean
    public JwtTokenStore tokenStore(){
        return  new JwtTokenStore(accessTokenConverter());
    }
}
