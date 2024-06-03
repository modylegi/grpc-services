build:
	@go build -o bin/out

run: build
	@./bin/out

generate:
	@protoc proto/cv.proto --go_out=. --go-grpc_out=. --go_opt=paths=source_relative --go-grpc_opt=paths=source_relative