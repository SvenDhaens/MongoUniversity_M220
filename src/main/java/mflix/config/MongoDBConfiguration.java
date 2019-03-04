package mflix.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.connection.SslSettings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class MongoDBConfiguration {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MongoClient mongoClient(@Value("${spring.mongodb.uri}") String connectionString) {

        ConnectionString connString = new ConnectionString(connectionString);

        //DONE> Ticket: Handling Timeouts - configure the expected
        // WriteConcern `wtimeout` and `connectTimeoutMS` values
        MongoClient mongoClient = MongoClients.create(connString);

        MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(connString).build();

//        SslSettings sslSettings = settings.getSslSettings();
//        ReadPreference readPreference = settings.getReadPreference();
//        ReadConcern readConcern = settings.getReadConcern();
//        WriteConcern writeConcern = settings.getWriteConcern();
//
//          EXAM: Which of the following variables contained the associated value?
//        readPreference.toString() = "primary"
//        sslSettings.isInvalidHostNameAllowed() = true
//        sslSettings.isEnabled() = false
//        readConcern.asDocument().toString() = "{ }"
//        writeConcern.asDocument().toString() = "{ w : 1 }"

        return mongoClient;
    }
}
