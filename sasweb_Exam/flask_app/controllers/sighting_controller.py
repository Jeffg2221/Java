from flask_app import app
from flask import flash, render_template, redirect, session, request
from flask_app.models.sighting_model import Sighting



@app.route('/dashboard')
def display_sightings():
    if 'email' not in session:
        return redirect('/')
    list_sightings = Sighting.get_all_with_users()
    return render_template('dashboard.html', list_sightings = list_sightings)

@app.route('/dashboard/new')
def display_create_sighting():
    if 'email' not in session:
        return redirect('/')
    return render_template("new_sighting.html")

@app.route('/dashboard/create', methods = ['POST'])
def create_sighting():
    if Sighting.validate_sighting(request.form) == False:
        return redirect('/dashboard/new')

    data = {
        **request.form,
        "user_id" : session['user_id']
    }

    Sighting.create(data)
    return redirect('/dashboard')

@app.route('/dashboard/<int:id>')
def display_one(id):
    if 'email' not in session:
        return redirect('/')
    data = {
        "id" : id
    }
    current_sighting = Sighting.get_one_with_user(data)
    return render_template("sighting.html", current_sighting = current_sighting)

@app.route('/dashboard/edit/<int:id>')
def display_updated_sighting(id):
    if 'email' not in session:
        return redirect('/')
    data = {
        "id" : id
    }
    current_sighting = Sighting.get_one_with_user(data)
    return render_template("edit_sighting.html", current_sighting = current_sighting)

@app.route('/dashboard/edit/<int:id>', methods = ['POST'])
def updated_sighting(id):
    if Sighting.validate_sighting(request.form) == False:
        return redirect(f'/dashboard/edit/{id}')
    sighting_data = {
        **request.form,
        "id" : id,
        "user_id" : session['user_id']
    }
    Sighting.update_one(sighting_data)
    return redirect('/dashboard')
    

@app.route('/dashboard/delete/<int:id>')
def delete_sighting(id):
    data = {
        "id" : id
    }
    Sighting.delete_one(data)
    return redirect('/dashboard')