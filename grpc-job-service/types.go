package main

import "go.mongodb.org/mongo-driver/bson/primitive"

type Job struct {
	ID          primitive.ObjectID `bson:"_id,omitempty"`
	Requirement string             `bson:"requirement"`
}
