FROM golang:1.22-alpine as builder

WORKDIR /app

COPY . .

RUN go mod download

RUN go build -o bin/out


FROM alpine:latest

WORKDIR /app

COPY --from=builder /app/bin/out /app/out

EXPOSE 4000

ENTRYPOINT ["/app/out"]
