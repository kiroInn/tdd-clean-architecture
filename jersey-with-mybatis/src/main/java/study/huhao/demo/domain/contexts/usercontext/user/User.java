package study.huhao.demo.domain.contexts.usercontext.user;

import study.huhao.demo.domain.core.concepts.AggregateRoot;

import java.util.UUID;

public class User implements AggregateRoot {
    private UUID id;
    private String name;
    private String userName;
    private String displayName;
    private String signature;
    private String email;

    User(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public User(UUID id, String name, String userName, String displayName, String signature, String email) {
        this.id = id;
        this.name = name;
        this.name = userName;
        this.name = displayName;
        this.name = signature;
        this.name = email;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getSignature() {
        return signature;
    }

    public String getDisplayName() {
        return displayName;
    }

}
