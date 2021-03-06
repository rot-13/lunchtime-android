package com.iic.lunchtime.models;

import com.iic.lunchtime.dal.UserDAO;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ifeins on 2/24/15.
 */
@DatabaseTable(tableName = "users", daoClass = UserDAO.class)
public class User {

  @DatabaseField(generatedId = true)
  private int id;

  @DatabaseField(columnName = "api_id")
  private int apiId;

  @DatabaseField(columnName = "first_name")
  private String firstName;

  @DatabaseField(columnName = "last_name")
  private String lastName;

  @DatabaseField(unique = true)
  private String email;

  @DatabaseField(columnName = "avatar_url")
  private String avatarUrl;

  public User(int apiId, String firstName, String lastName, String email, String avatarUrl) {
    this.apiId = apiId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.avatarUrl = avatarUrl;
  }

  public User() {
    // needed for ORMLite
  }

  public int getId() {
    return id;
  }

  public int getApiId() {
    return apiId;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }
}
