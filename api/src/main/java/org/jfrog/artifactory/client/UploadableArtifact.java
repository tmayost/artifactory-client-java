package org.jfrog.artifactory.client;

import org.jfrog.artifactory.client.model.File;

/**
 * @author jbaruch
 * @since 12/08/12
 */
public interface UploadableArtifact extends Artifact<UploadableArtifact> {

    File doUpload();

    String doUploadAndExplode();

    UploadableArtifact withListener(UploadListener listener);

    UploadableArtifact bySha1Checksum();

    UploadableArtifact bySha1Checksum(String sha1);
}
