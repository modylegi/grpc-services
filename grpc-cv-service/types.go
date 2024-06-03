package main

import "go.mongodb.org/mongo-driver/bson/primitive"

type CV struct {
	ID    primitive.ObjectID `bson:"_id,omitempty"`
	Skill string             `bson:"skill"`
}
