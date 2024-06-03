package main

import (
	"fmt"
	"log"
	"net"
	"os"
	"strconv"

	_ "github.com/joho/godotenv/autoload"
	"github.com/modylegi/grpc-cv-service/proto"
	"google.golang.org/grpc"
)

func main() {
	port, _ := strconv.Atoi(os.Getenv("PORT"))
	ln, err := net.Listen("tcp", fmt.Sprintf(":%v", port))
	if err != nil {
		log.Fatal(err)
	}
	svc := NewService()
	opts := []grpc.ServerOption{}
	server := grpc.NewServer(opts...)
	serviceServer := NewCVServiceServer(svc)
	proto.RegisterCVServiceServer(server, serviceServer)
	if err := server.Serve(ln); err != nil {
		log.Fatal(err)
	}
}
