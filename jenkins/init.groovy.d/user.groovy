def githubAccount = new UsernamePasswordCredentialsImpl(
        CredentialsScope.GLOBAL, "admin-nexus", "Test Nexus Account",
        "admin_nina",
        "Ninasv31"
)
store.addCredentials(domain, nexusAccount)
