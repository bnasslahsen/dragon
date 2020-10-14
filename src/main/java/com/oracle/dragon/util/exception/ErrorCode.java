package com.oracle.dragon.util.exception;

public enum ErrorCode {
    UnsupportedPlatform(-1),
    MissingDatabaseNameParameter(-2),
    ConfigurationFileNotFound(-3),
    ConfigurationFileLoadProblem(-4),
    ConfigurationMissesParameter(-5),
    OCIAPIAuthenticationPrivateKeyNotFound(-6),
    OCIAPIDatabase(-7),
    OCIDatabaseTerminationFailed(-8),
    OCIDatabaseWaitForTerminationFailed(-9),
    OCIAlwaysFreeDatabaseLimitReached(-10),
    OCIDatabaseNameAlreadyExists(-11),
    OCIDatabaseCreationCantProceedFurther(-12),
    OCIDatabaseCreationFailed(-13),
    DatabaseWalletSaving(-14),
    DatabaseWalletCorrupted(-15),
    DatabaseUserCreationFailed(-16),
    ObjectStorageConfigurationFailed(-17),
    ObjectStorageBucketCreationFailed(-18),
    MissingProfileNameParameter(-19),
    ConfigurationProfileNotFound(-20),
    ConfigurationParsing(-21),
    ConfigurationWrongDatabaseLicenseType(-22),
    ConfigurationWrongDatabaseType(-23),
    ConfigurationDataPathNotFound(-24),
    ConfigurationDataPathDirectory(-25),
    SecurityAlgorithmNotFound(-26),
    DataFileToLoadNotFound(-27),
    DataFileNotLoaded(-28),
    CollectionNotLoaded(-29),
    LocalConfigurationNotSaved(-30),
    AutonomousDatabaseLimitReached(-31);

    public final int internalErrorCode;

    ErrorCode(final int errorCode) {
        this.internalErrorCode = errorCode;
    }
}
