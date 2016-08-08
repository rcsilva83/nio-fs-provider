package no.maddin.niofs.sftp;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/**
 * Represents a host for the SFTP file system provider.
 *  
 */
public class SFTPHost extends FileSystem {

  private final FileSystemProvider provider;
  private final URI serverUri;
  private final int port;
  private final String host;
  private final String password;
  private final String username;
  
  public SFTPHost(FileSystemProvider provider, URI serverUri) {
    this.provider = provider;
    this.serverUri = serverUri;
    this.host = serverUri.getHost();
    this.port = serverUri.getPort();
    String[] ui = serverUri.getUserInfo().split(":");
    this.username = ui[0];
    this.password = ui[1];
  }
  
  @Override
  public FileSystemProvider provider() {
    return provider;
  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean isOpen() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isReadOnly() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String getSeparator() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Iterable<Path> getRootDirectories() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Iterable<FileStore> getFileStores() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Set<String> supportedFileAttributeViews() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Path getPath(String first, String... more) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PathMatcher getPathMatcher(String syntaxAndPattern) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UserPrincipalLookupService getUserPrincipalLookupService() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public WatchService newWatchService() throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  public String getUserName() {
    return this.username;
  }

  public String getPassword() {
    return this.password;
  }
  
  public String getHost() {
    return this.host;
  }

  public int getPort() {
    return this.port;
  }
}