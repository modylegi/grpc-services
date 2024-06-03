package main

import (
	"context"

	"github.com/modylegi/grpc-cv-service/proto"
)

type CVServiceServer struct {
	svc Service
	proto.UnimplementedCVServiceServer
}

func NewCVServiceServer(svc Service) *CVServiceServer {
	return &CVServiceServer{
		svc: svc,
	}
}

func (s *CVServiceServer) GetAllCVs(ctx context.Context, _ *proto.GetAllCVsRequest) (*proto.GetAllCVsResponse, error) {
	cvs, err := s.svc.GetAllCV(ctx)
	if err != nil {
		return nil, err
	}
	var cvResponses []*proto.CVResponse
	for _, cv := range cvs {
		cvResponses = append(cvResponses, &proto.CVResponse{
			Id:    cv.ID.Hex(),
			Skill: cv.Skill,
		})
	}
	return &proto.GetAllCVsResponse{
		Cvs: cvResponses,
	}, nil
}
