package cn.itcast.gateway;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


public class KeyResolverCofiguration {

    /*@Bean
    public KeyResolver pathKeyResolver(){
        return new KeyResolver() {
            @Override
            public Mono<String> resolve(ServerWebExchange exchange) {
                return Mono.just(exchange.getRequest().getPath().toString());
            }
        };
    }*/

    @Bean
    public KeyResolver userkeyResolver(){
        return exchange -> Mono.just(
                exchange.getRequest().getQueryParams().getFirst("userId")
        );
    }
}
