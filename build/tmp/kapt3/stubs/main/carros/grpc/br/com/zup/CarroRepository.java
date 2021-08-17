package carros.grpc.br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcarros/grpc/br/com/zup/CarroRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lcarros/grpc/br/com/zup/Carro;", "", "existsByPlaca", "", "placa", "", "edu"})
@io.micronaut.data.annotation.Repository()
public abstract interface CarroRepository extends io.micronaut.data.jpa.repository.JpaRepository<carros.grpc.br.com.zup.Carro, java.lang.Long> {
    
    public abstract boolean existsByPlaca(@org.jetbrains.annotations.NotNull()
    java.lang.String placa);
}