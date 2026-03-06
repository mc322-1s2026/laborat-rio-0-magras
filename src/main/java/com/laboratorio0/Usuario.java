package com.laboratorio0;

public class Usuario {
    private final String nomeUsuario; // 'final' = imutabilidade
    private final String email;

    public Usuario(String nomeUsuario, String email) {
        // FAIL-FAST: O porteiro barra o lixo antes de entrar na Heap
        if (nomeUsuario == null || nomeUsuario.isBlank()) {
            throw new RuntimeException("Usuário não pode ser vazio.");
        }
        if (email == null || !email.contains("@")) {
            throw new RuntimeException("Email inválido.");
        }

        // 'this' aponta para a "caixa" (atributo) do objeto que está nascendo
        this.nomeUsuario = nomeUsuario;
        this.email = email;
    }

    public String getNomeUsuario() { return nomeUsuario; }
    public String getEmail() { return email; }
}
