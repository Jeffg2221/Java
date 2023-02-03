from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask import flash
from flask_app.models.user_model import User

class Sighting:
    def __init__(self,data):
        self.id = data['id']
        self.location = data['location']
        self.what_happened = data['what_happened']
        self.date_seen = data['date_seen']
        self.num_saq = data['num_saq']
        self.user_id = data['user_id']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']


    @classmethod
    def create(cls,data):
        query = "INSERT INTO sightings( location, what_happened, date_seen , num_saq, user_id) "
        query += "VALUES( %(location)s, %(what_happened)s, %(date_seen)s, %(num_saq)s, %(user_id)s);"

        return connectToMySQL(DATABASE).query_db(query,data)

    @classmethod
    def get_all_with_users(cls):
        query = "SELECT * "
        query += "FROM sightings "
        query += "JOIN users ON sightings.user_id = users.id;"

        results = connectToMySQL(DATABASE).query_db(query)
        list_sightings = []

        for row in results:
            current_sighting = cls(row)
            user_data = {
                **row,
                "created_at": row['users.created_at'],
                "updated_at": row['users.updated_at'],
                "id" : row['users.id']
            }
            current_user = User(user_data)
            current_sighting.user = current_user
            list_sightings.append(current_sighting)
        return list_sightings

    @classmethod
    def get_one_with_user(cls, data):
        query = "SELECT * "
        query += "FROM sightings "
        query += "JOIN users ON sightings.user_id = users.id "
        query += "WHERE sightings.id = %(id)s;"
        
        result = connectToMySQL(DATABASE).query_db(query, data)

        if result:
            current_sighting = cls(result[0])
            user_data = {
                **result[0],
                "created_at": result[0] ['users.created_at'],
                "updated_at": result[0] ['users.updated_at'],
                "id" : result[0]['users.id']
            }
            current_sighting.user = User(user_data)
            return current_sighting
        else:
            return None

    @classmethod
    def update_one(cls, data):
        query = "UPDATE sightings "
        query += "SET location = %(location)s, what_happened = %(what_happened)s,"
        query += "date_seen = %(date_seen)s, num_saq = %(num_saq)s, user_id = %(user_id)s "
        query += "WHERE id = %(id)s;"

        return connectToMySQL(DATABASE).query_db(query, data)

    @classmethod
    def delete_one(cls, data):
        query = "DELETE FROM sightings "
        query += "WHERE id = %(id)s; "
        return connectToMySQL(DATABASE).query_db(query, data)


    @staticmethod
    def validate_sighting(data):
        is_valid = True
        if data['location'] == "":
            flash("Location must not be empty", "erro_sightings_location")
            is_valid = False
        if data['what_happened'] == "":
            flash("What happened must not be empty", "error_sightings_what_happened") 
            is_valid = False
        if data['date_seen'] == "":
            flash("Date see must not be empty", "error_sightings_date_seen")
            is_valid = False
        if len(data['location'] )< 3:
            flash("Name must be at least 3 characters long", "error_sightings_location")
            is_valid = False
        if len(data['what_happened'] )< 3:
            flash("Description must be at least 3 characters long", "error_sighting_description")
            is_valid = False
        if len(data['num_saq'] )< 1:
            flash("Number of Sasquatches must be atleast 1", "error_sightings_num_saq")
            is_valid = False
        
        return is_valid
