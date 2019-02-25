package mflix.api.daos;

import mflix.api.models.Comment;
import org.bson.BsonReader;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.Document;
import org.bson.codecs.Codec;
import org.bson.codecs.CollectibleCodec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.DocumentCodec;
import org.bson.codecs.EncoderContext;

public class CommentCodec implements CollectibleCodec<Comment> {

    private final Codec<Document> documentCodec;

    public CommentCodec() {
        super();
        this.documentCodec = new DocumentCodec();
    }

    @Override
    public Comment generateIdIfAbsentFromDocument(Comment document) {
        return null;
    }

    @Override
    public boolean documentHasId(Comment document) {
        return false;
    }

    @Override
    public BsonValue getDocumentId(Comment document) {
        return null;
    }

    @Override
    public Comment decode(BsonReader reader, DecoderContext decoderContext) {
        return null;
    }

    @Override
    public void encode(BsonWriter writer, Comment comment, EncoderContext encoderContext) {
//
//            Document commentDoc = new Document();
//            String actorId = comment.getId();
//            String name = comment.getName();
//            Date dateOfBirth = comment.getDateOfBirth();
//            List awards = comment.getAwards();
//            int numMovies = comment.getNumMovies();
//
//            if (null != actorId) {
//                actorDoc.put("_id", new ObjectId(actorId));
//            }
//
//            if (null != name) {
//                actorDoc.put("name", name);
//            }
//
//            if (null != dateOfBirth) {
//                actorDoc.put("date_of_birth", dateOfBirth);
//            }
//
//            if (null != awards) {
//                actorDoc.put("awards", awards);
//            }
//
//            if (0 != numMovies) {
//                actorDoc.put("num_movies", numMovies);
//            }
//
//            documentCodec.encode(bsonWriter, actorDoc, encoderContext);
//
    }

    @Override
    public Class<Comment> getEncoderClass() {
        return null;
    }
}
