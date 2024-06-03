package main

import (
	"context"
	"fmt"
	"log"
	"os"
	"time"

	
	"go.mongodb.org/mongo-driver/bson"
	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
)

var (
	host     = os.Getenv("DB_HOST")
	port     = os.Getenv("DB_PORT")
	database = os.Getenv("DB_DATABASE")
)

type Service interface {
	GetAllCV(context.Context) ([]CV, error)
}

type service struct {
	db           *mongo.Client
	cv_colletion *mongo.Collection
}

func NewService() Service {
	client, err := mongo.Connect(context.Background(), options.Client().ApplyURI(fmt.Sprintf("mongodb://%s:%s", host, port)))
	if err != nil {
		log.Fatal(err)

	}
	return &service{
		db:           client,
		cv_colletion: client.Database(database).Collection("cvs"),
	}
}

func (s *service) GetAllCV(ctx context.Context) ([]CV, error) {
	ctx, cancel := context.WithTimeout(ctx, time.Second*5)
	defer cancel()
	cursor, err := s.cv_colletion.Find(ctx, bson.D{})
	if err != nil {
		return nil, err
	}
	var res []CV
	if err := cursor.All(ctx, &res); err != nil {
		return nil, err
	}
	return res, nil

}
